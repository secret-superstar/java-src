package util.jar;

import org.junit.Test;

import java.io.*;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;


/**
 * 测试解释jar的文件操作
 * 描述：
 * 1. jar是继承了zipFile的，只是对于增加了jar的特性的处理
 * 2. jar 里面的文件的处理，是对其class的文件的字符流的处理，并且解析操作，然后加载到内存中进行处理。
 * 3.
 */
public class TestJar {

    /**
     * jar的操作：
     * 1. 创建jar的文件信息，怎么来创建一个class文件，
     * 2. 然后把class文件打包成一个jar文件
     * 3. 然后新增一个class文件，然后加入到这个jar的文件信息里面
     * 4. 遍历jar的文件信息
     * 5. 最后删除jar的文件信息
     *
     * @todo 需要对jar的处理操作
     * 参考：
     *  https://www.cnblogs.com/lihuibin/p/9121012.html
     */
    @Test
    public void testCrud() {

    }

    /**
     * @param jarPath   jar文件的路径
     * @param name      要读取的文件名称，要添加后缀名
     * @param toNewFile 将拷贝到的信息复制到目标文件
     * @throws IOException
     * @function 读取jar包中指定文件的内容并且将读取到的内容拷贝到指定文件中
     */
    public void readFileFromJar(String jarPath, String name, File toNewFile) throws IOException {
        JarFile jf = new JarFile(jarPath);
        Enumeration<JarEntry> jfs = jf.entries();
        StringBuffer sb = new StringBuffer();
        while (jfs.hasMoreElements()) {
            JarEntry jfn = jfs.nextElement();
            if (jfn.getName().endsWith(name)) {
                InputStream is = jf.getInputStream(jfn);
                FileOutputStream fos = new FileOutputStream(toNewFile);
                BufferedInputStream bis = new BufferedInputStream(is);
                byte[] buf = new byte[is.available()];
                while (bis.read(buf) != -1) {
                    fos.write(buf);

                }
                fos.close();
                bis.close();
                is.close();
                break;
            }
        }

    }
}
