#coding=utf-8

from moviepy.editor import VideoFileClip
from moviepy.video.io.ffmpeg_tools import ffmpeg_extract_subclip
import face_recognition
import moviepy.editor as mp
import time,os
import subprocess
import threading
from threading import Lock,Thread

readyFiles=[]
fileDir = "/home/split/0/"
def contain_godness(img, godness_encoding):
    face_locations = face_recognition.face_locations(img)
    is_godness = False
    for (top_right_y, top_right_x, left_bottom_y,left_bottom_x) in face_locations:
        unknown_image = img[top_right_y-50:left_bottom_y+50, left_bottom_x-50:top_right_x+50]
        unknown_encoding = face_recognition.face_encodings(unknown_image,model="large")
        if unknown_encoding:
            results = face_recognition.compare_faces(godness_encoding, unknown_encoding[0],0.39)
            is_godness = results[0]
    return is_godness


def find_durations_second(clip, target_image_code,filename):
    duration_name_list = []  # 存储分割后视频的名称列表
    start_time = 0      # 记录片段开始时间, 以秒为单位
    end_time = 0        # 记录片段结束时间, 以秒为单位
    skip=0
    privious_end_time = 0
    last_false_time=0
    fps = clip.fps
    count =0
    for i, img in enumerate(clip.iter_frames(fps=fps)):
        # 跳过次数
        if i < skip: continue

        # 按秒跳过
        skip=(i+fps)

        # 对比人脸
        flag = contain_godness(img, target_image_code)
        print(flag)

        # 如果对比通过,首先记录当前视频时间，如果是第一次，当成开始时间
        if flag:
            privious_end_time= (i / fps) +1 # 随着进度往后移动
            last_false_time = 0 # 如果有一次正确，最后的错误时间就重新计算
            if start_time == 0:
                start_time = (i / fps)
        # 如果对比不通过并且开始时间不为0，
        if start_time > 0 and not flag:
            end_time = (i / fps)
            if(last_false_time == 0): last_false_time=end_time
            if((end_time - last_false_time ) < 5): continue
            if((end_time - last_false_time ) > 5):  # 如果连续错误超过五秒，就剪辑出前面两次正确的那段
                end_time=privious_end_time
                i=(i-clip.fps)
            if((end_time - start_time) < 1): 
                continue
            print(start_time,end_time)

            # 根据开始时间和结束时间截取视频
            split_name=filename.replace(".mp4","")+"_"+str(i)+".mp4"
            #ffmpeg_extract_subclip("/home/videos/"+filename, start_time-0.5, end_time+0.5,split_name)
            clip.subclip(start_time-0.5, end_time+0.5).write_videofile(split_name)
            duration_name_list.append(split_name)
            # 重置开始时间和结束时间
            start_time = end_time = last_false_time = 0
            count = count+1
            #if(count >2): break
    # 打印分割后视频的名称列表
    print(duration_name_list)
    return duration_name_list
        
def split_file(filename):
    clip = VideoFileClip(fileDir+filename)
    target_image1 = face_recognition.load_image_file("demo1.png")
    target_image2 = face_recognition.load_image_file("demo2.png")
    target_image3 = face_recognition.load_image_file("demo3.png")
    target_image4 = face_recognition.load_image_file("demo4.png")
    target_image5 = face_recognition.load_image_file("demo5.png")
    target_image6 = face_recognition.load_image_file("demo6.png")
    target_image7 = face_recognition.load_image_file("demo7.png")
    target_image8 = face_recognition.load_image_file("demo8.png")
    target_image9 = face_recognition.load_image_file("demo9.png")
    target_image10 = face_recognition.load_image_file("demo10.png")
    target_image_code = []
    target_image_code.append(face_recognition.face_encodings(target_image1)[0])
    target_image_code.append(face_recognition.face_encodings(target_image2)[0])
    target_image_code.append(face_recognition.face_encodings(target_image3)[0])
    target_image_code.append(face_recognition.face_encodings(target_image4)[0])
    target_image_code.append(face_recognition.face_encodings(target_image5)[0])
    target_image_code.append(face_recognition.face_encodings(target_image6)[0])
    target_image_code.append(face_recognition.face_encodings(target_image7)[0])
    target_image_code.append(face_recognition.face_encodings(target_image8)[0])
    target_image_code.append(face_recognition.face_encodings(target_image9)[0])
    target_image_code.append(face_recognition.face_encodings(target_image10)[0])
    # 首先将视频剪辑成片段，返回成文件名称的数组
    durations = find_durations_second(clip, target_image_code,filename)

    # 再将片段整合成一个
    tmpClip = []
    for tempFileName in durations:
      print("准备加载视频文件："+tempFileName)
      clip = mp.VideoFileClip(tempFileName)
      tmpClip.append(clip)
    if len(tmpClip):
      print("进行内存视频拼接...")
      destClip = mp.concatenate_videoclips(tmpClip)
      print("内存视频拼接完成，准备输出到文件.")
      destClip.write_videofile("/home/out/"+filename+"dest.mp4", fps=clip.fps, remove_temp=True)
    for tempFileName in durations:
       print("准备删除视频文件："+tempFileName)
       os.remove(tempFileName)
    print("输出到文成功！")
    os.remove(fileDir+filename)     
if __name__ == "__main__":
    while True :
      file_dir = fileDir
      a = os.walk(file_dir)
      for root, dirs, files in os.walk(file_dir):
        for file in files: 
          if os.path.splitext(file)[1] == '.mp4':
            if file.startswith("all_"):
              print(file) 
              split_file(file)
      time.sleep(0.1)            
