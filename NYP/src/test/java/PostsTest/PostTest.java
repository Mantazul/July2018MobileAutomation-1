package PostsTest;

import PostsHomePage.Posts;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PostTest extends Base{

    Posts posts;
    @BeforeMethod
    public void init(){
       posts = PageFactory.initElements(ad,Posts.class);
    }
    @Test
    public void testClickOnFirstHeadLine(){
        posts.clickOnFirstHeadline();
    }
}
