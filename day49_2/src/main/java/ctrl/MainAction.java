package ctrl;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.BoardDAO;
import board.BoardSet;
import board.BoardVO;

public class MainAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {		
		BoardDAO dao=new BoardDAO();
		BoardVO vo=new BoardVO();
		String paramCnt=request.getParameter("cnt");
		System.out.println(paramCnt);
		if(paramCnt==null || paramCnt.equals("")){
			vo.setCnt(2);
		}
		else {
			vo.setCnt(Integer.parseInt(paramCnt));
		}
		ArrayList<BoardSet> datas=dao.selectAll(vo);
		request.setAttribute("datas", datas);
		
		HttpSession session=request.getSession();
		session.setAttribute("cnt", vo.getCnt());
		
		ActionForward forward=new ActionForward();
		forward.setPath("/main.jsp");
		forward.setRedirect(false);
		return forward;
	}

}
