##十六章  ------文件io处理

##File类
* File(String pathname)
* File(File parent,String child)
* boolean createNewFile()
* boolean delete()
* boolean exists()
* File getParentFile()
* boolean mkdirs()
* 解决不同系统的文件操作符号不一样的问题

##File的读写操作
* 字节流和字符流  OutputStream,InputStream  Writer,Reader
* OutPutStream的常用方法:
* void write(int b);
* void write(byte[] b);
* void write(byte[] b,int off,int len);
* void close()
* void flush();
* FileOutPutStream的常用方法:
* FileOutPutStream(File file);
* FileOutPutStream(File file,boolean append);
* FileInputStream常用方法:
* int read();
* int read(byte[] b);
* int read(byte[] b,int off,int len);
* void close();
* byte[] readAllBytes(); 一次读取全部字节
* long transformTo(OutPutStream out); 将字节存入输出流
* Writer的常用操作:
* Writer append();
* void write(char[] chuf);
* void write(int c);
* void write(String str);
* void flush();
* void close();
* Reader的常见操作:
* int read()
* int read(char[] c):
* long skip(long n):跳过N长度的字符后在读取
* boolean ready():是否可以开始读取文件
* void close();
* 利用管道流实现线程通信:
* void connect(PipedInputStream snk)
* void connect(PipReader snk)
* 对象序列化：实现对对象的存取
* ObjectOutputStream
* Object ObjectOutputStream(OutputStream, out)
* final void writeObject(Object obj)
* ObjectInputStream
* transient:修饰的字段能够不被序列化
