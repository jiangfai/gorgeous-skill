package oracle1703;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.qfedu.mapper.DeptMapper;
import com.qfedu.param.DeptParam;

public class Test02 {

	public static void main(String[] args) throws IOException  {
		try (InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml")) {
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session = factory.openSession();
			DeptMapper mapper = session.getMapper(DeptMapper.class);
			DeptParam param = new DeptParam();
			param.setNo(30);
			mapper.getDeptAvgSal(param );
			System.out.println(param.getAvgSal());
			session.close();
		}
	}
}
