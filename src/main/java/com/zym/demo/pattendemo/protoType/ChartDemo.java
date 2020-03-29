package com.zym.demo.pattendemo.protoType;

import java.io.*;

public class ChartDemo implements Serializable {

    private String name;

    private String color;

    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ChartDemo clone() {
        ByteArrayOutputStream out = null;
        ObjectOutputStream obj = null;
        ObjectInputStream in = null;
        ByteArrayInputStream byteIn = null;
        try {
            out = new ByteArrayOutputStream();
            obj = new ObjectOutputStream(out);
            obj.writeObject(this);
            byteIn = new ByteArrayInputStream(out.toByteArray());
            in = new ObjectInputStream(byteIn);
            return (ChartDemo) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (obj != null) {
                try {
                    obj.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (byteIn != null) {
                try {
                    byteIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
