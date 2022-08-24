package ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;
import member.MemberVO;

public class InsertMemberAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=null;
		
		MemberDAO dao=new MemberDAO();
		MemberVO vo=new MemberVO();
		vo.setMid(request.getParameter("mid"));
		vo.setMname(request.getParameter("mname"));
		vo.setMpw(request.getParameter("mpw"));
		if(dao.insert(vo)){
			forward=new ActionForward();
			forward.setPath("main.do");
			forward.setRedirect(true);
		}
		else{
			throw new Exception("insertM 오류");
		}
		return forward;
	}

}
