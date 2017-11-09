package wusc.edu.demo.user.PasswordCallback;

import java.security.Security;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;

import com.alibaba.druid.filter.config.ConfigTools;
import com.alibaba.druid.util.DruidPasswordCallback;

/**
 * 数据库密码回调解密
 */
@SuppressWarnings("serial")
public class DBPasswordCallback extends DruidPasswordCallback {
	//上述生成的公钥
	public static final String PUBLIC_KEY_STRING = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKbe85lMgxPlbVv54UnikyFIuO7fMf1Tcr/yLP7tpzoc+PHN9scH7d6eQ/U6gjYPbsi7bz1iCReTzXFqy3Z0kV0CAwEAAQ==";

	    public void setProperties(Properties properties) {
	        super.setProperties(properties);
	        String pwd = properties.getProperty("jdbc.password");
	        if (StringUtils.isNotBlank(pwd)) {
	            try {
	                //这里的password是将jdbc.properties配置得到的密码进行解密之后的值
	                //所以这里的代码是将密码进行解密
	                //TODO 将pwd进行解密;
	                String password = ConfigTools.decrypt(PUBLIC_KEY_STRING, pwd); 
	                setPassword(password.toCharArray());
	            } catch (Exception e) {
	                setPassword(pwd.toCharArray());
	            }
	        }
	    }

	    // 请使用该方法加密后，把密文写入classpath:/config/jdbc.properties
	    public static void main(String[] args) {
	        //System.out.println(Security.encryptDes("", key));
	    }
}
