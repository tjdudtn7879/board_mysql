package com.lgy.board_mysql.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.board_mysql.dao.BoardDAO;

//게시글 저장
public class BoardWriteService implements BoardService{

	@Override
	public void execute(Model model) {
//		Dao에 있는 String boardName, String boardTitle, String boardContent 값들이 필요
//		model 객체에서 꺼내서 전송
		Map<String, Object>map = model.asMap();
//		request : 컨트롤단에서 보내주는 이름
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String boardName = request.getParameter("boardName");
		String boardTitle = request.getParameter("boardTitle");
		String boardContent = request.getParameter("boardContent");
		
		BoardDAO dao=new BoardDAO();
		dao.write(boardName, boardTitle, boardContent);
	}
	
}
