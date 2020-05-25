package ltd.springboot.mall.controller.common;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import com.google.code.kaptcha.util.Config;

import java.util.Properties;

/**
 * 配置验证码
 */
@Component
public class KaptchaConfig {
    @Bean
    public DefaultKaptcha getDefaultKaptcha(){
        com.google.code.kaptcha.impl.DefaultKaptcha defaultKaptcha = new com.google.code.kaptcha.impl.DefaultKaptcha();
        Properties properties = new Properties();
        //图片边框
        properties.put("kaptcha.border", "no");
        //字体颜色
        properties.put("kaptcha.textproducer.font.color", "black");
        //图片宽
        properties.put("kaptcha.image.width", "150");
        //图片高
        properties.put("kaptcha.image.height", "40");
        //字体大小
        properties.put("kaptcha.textproducer.font.size", "30");
        //键名称
        properties.put("kaptcha.session.key", "verifyCode");
        //验证码长度
        properties.put("kaptcha.textproducer.char.space", "5");
        Config config = new Config(properties);
        defaultKaptcha.setConfig(config);

        return defaultKaptcha;
    }
}