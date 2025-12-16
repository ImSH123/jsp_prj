package day1215;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.jsp.JspWriter;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import kr.co.sist.emp.DeptDTO;
import kr.co.sist.emp.EmployeeDAO;

public class CreateDeptXML {
	public void createXML(List<DeptDTO> list, JspWriter out) throws IOException {
		// 1. XML 문서 객체 생성
		Document doc = new Document();
		
		// 2. 최상위 부모 노드 생성
		Element deptsNode = new Element("depts");
		
		// 3. 최상위 부모 노드를 문서 객체에 추가
		doc.addContent(deptsNode);
		
		// 6. 생성된 객체 출력
		XMLOutputter xOut = new XMLOutputter(Format.getPrettyFormat());
		xOut.output(doc, System.out);
		FileOutputStream fos = new FileOutputStream("C:/dev/workspace/jsp_prj/src/main/webapp/xml1215/deptInfo.xml");
		xOut.output(doc, fos);
		xOut.output(doc, out);
		
		if (fos != null) {
			
		}
	}
}
