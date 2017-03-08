package pokerproject.server.main;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by timurrassolov on 06/03/2017.
 * <p>
 * Some tests to show library usage
 */
public class TempTest {

    @Test
    public void testOk() {
        Assert.assertTrue(true);
    }

    @Test
    public void apacheCommonsLang() {
        Assert.assertTrue(ObjectUtils.notEqual(null, "word"));
        Assert.assertTrue(StringUtils.isEmpty(""));
        Assert.assertTrue(StringUtils.isEmpty(null));

    }

    @Test
    public void apacheCommmonsCollections() {
        Assert.assertTrue(CollectionUtils.isEmpty(null));
        Assert.assertTrue(CollectionUtils.isEmpty(new ArrayList()));
    }


}
