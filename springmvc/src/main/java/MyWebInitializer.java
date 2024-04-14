import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import view.WebConfig;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null; // 루트 설정 클래스 사용하지 않음
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class }; // DispatcherServlet의 설정 클래스 지정
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" }; // 모든 요청을 DispatcherServlet으로 보냄
    }
}
