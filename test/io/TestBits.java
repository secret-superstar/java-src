package io;

import org.junit.Assert;
import org.junit.Test;
import java.io.File;

/**
 * Created by Macx on 2019/12/27.
 */
public class TestBits {

    @Test
    public void getBoolean(){

        Assert.assertTrue(true);
        File file = new File("D:\\a.txt");
        Assert.assertFalse(file.canRead());
    }
}
