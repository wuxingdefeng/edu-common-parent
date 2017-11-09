package wusc.edu.demo.common.util;

import org.junit.Test;

import com.alibaba.druid.filter.config.ConfigTools;

public class ConfigToolsDemo {

	 //上述生成的私钥
    private static final String PRIVATE_KEY_STRING = "MIIBVQIBADANBgkqhkiG9w0BAQEFAASCAT8wggE7AgEAAkEApt7zmUyDE+VtW/nhSeKTIUi47t8x/VNyv/Is/u2nOhz48c32xwft3p5D9TqCNg9uyLtvPWIJF5PNcWrLdnSRXQIDAQABAkEAkYYDSGBKO1KsMTbUerul9bPW2zI4BST+AFixVsxoNqtcJige7VcrZ8svqTY3o5/6znkejjm2w1FhR8v+j6LDoQIhAOqZ2mbICUtEW6WOQsHiJSy2H82SRW5rIohHHABKDuqJAiEAtheKC6R4MWZZG1fnniuKjbBH3+6qeDlROk1qIO3xKzUCIEqCyRIh8Im+UVlYwK0xtVrpEVrKXVD/p/0ekK8q1mf5AiARLHUrle50EkgTKR5CL68Yn+iXeSYAwr8jdYut4WMehQIhAMd4+0tBKMIvaGKevrfxE/rFOFUj8IK/34HtM3adBx/I";

    @Test
    public void demo() throws Exception {
        //密码明文，也就是数据库的密码
        String plainText = "root";
        System.out.printf(ConfigTools.encrypt(PRIVATE_KEY_STRING, plainText));
    }
}
