##ʮ����  ------�ļ�io����

##File��
* File(String pathname)
* File(File parent,String child)
* boolean createNewFile()
* boolean delete()
* boolean exists()
* File getParentFile()
* boolean mkdirs()
* �����ͬϵͳ���ļ��������Ų�һ��������

##File�Ķ�д����
* �ֽ������ַ���  OutputStream,InputStream  Writer,Reader
* OutPutStream�ĳ��÷���:
* void write(int b);
* void write(byte[] b);
* void write(byte[] b,int off,int len);
* void close()
* void flush();
* FileOutPutStream�ĳ��÷���:
* FileOutPutStream(File file);
* FileOutPutStream(File file,boolean append);
* FileInputStream���÷���:
* int read();
* int read(byte[] b);
* int read(byte[] b,int off,int len);
* void close();
* byte[] readAllBytes(); һ�ζ�ȡȫ���ֽ�
* long transformTo(OutPutStream out); ���ֽڴ��������
* Writer�ĳ��ò���:
* Writer append();
* void write(char[] chuf);
* void write(int c);
* void write(String str);
* void flush();
* void close();
* Reader�ĳ�������:
* int read()
* int read(char[] c):
* long skip(long n):����N���ȵ��ַ����ڶ�ȡ
* boolean ready():�Ƿ���Կ�ʼ��ȡ�ļ�
* void close();
* ���ùܵ���ʵ���߳�ͨ��:
* void connect(PipedInputStream snk)
* void connect(PipReader snk)
* �������л���ʵ�ֶԶ���Ĵ�ȡ
* ObjectOutputStream
* Object ObjectOutputStream(OutputStream, out)
* final void writeObject(Object obj)
* ObjectInputStream
* transient:���ε��ֶ��ܹ��������л�
