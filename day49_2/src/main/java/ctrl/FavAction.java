package ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.BoardDAO;
import board.BoardVO;

public class FavAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward=null;
		
		BoardDAO dao=new BoardDAO();
		BoardVO vo=new BoardVO();
		
		HttpSession session=request.getSession();
		session.setAttribute("cnt", vo.getCnt());
		
		vo.setBid(Integer.parseInt(request.getParameter("bid")));
		if(dao.update(vo)){
			forward=new ActionForward();
			forward.setPath("main.do");
			forward.setRedirect(false);
		}
		else{
			throw new Exception("fav 오류");
		}
		
		return forward;
	}

}
