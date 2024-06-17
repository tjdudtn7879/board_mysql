package com.lgy.board_mysql.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.board_mysql.dao.BoardDAO;

public class BoardDeleteService implements BoardService{

	@Override
	public void execute(Model model) {
		
		Map<String, Object>map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String boardNo = request.getParameter("boardNo");
		
		BoardDAO dao = new BoardDAO();
		dao.delete(boardNo); 
	}
	
}
