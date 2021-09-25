#coding=utf-8

from moviepy.editor import VideoFileClip
from moviepy.video.io.ffmpeg_tools import ffmpeg_extract_subclip
import face_recognition
import moviepy.editor as mp
import time,os
import subprocess

if __name__ == "__main__":
    file_dir = "/home/videos/"
    a = os.walk(file_dir)
    for root, dirs, files in os.walk(file_dir):
      for file in files: 
        if os.path.splitext(file)[1] == '.mp4':
          print(file) 
          clip = VideoFileClip("/home/videos/"+file)
          second = clip.duration
          print(second) 
          start = 0
          count = int(second/300)+1          
          for i in range(count):
            print(i)
            fileNum = int (i%5)
            templateFile = file;
            splidFileName = templateFile.replace(".mp4","")+"_split_"+str(i)+".mp4"
            if not os.path.isfile("/home/split/"+str(fileNum)+"/"+splidFileName):
                end = start + 300
                if(end > second):
                  end = second 
                print(str(start)+":"+str(end))                
                clip.subclip(start, end).write_videofile("/home/split/"+str(fileNum)+"/"+splidFileName)
                os.rename("/home/split/"+str(fileNum)+"/"+splidFileName,"/home/split/"+str(fileNum)+"/all_"+splidFileName)
                start = end
                if(end == second):
                  os.remove("/home/videos/"+file)
                  break