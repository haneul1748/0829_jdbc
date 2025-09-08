package com.kh.board.controller;

import java.util.List;

import com.kh.board.medel.dto.BoardDTO;
import com.kh.board.medel.service.BoardService;
import com.kh.board.medel.vo.Board;

public class BoardController {
	
	public int insertBoard(BoardDTO bd) {
		int result = new BoardService().insertBoard(bd);
		return result;
	}
	
	public List<Board> selectBoardList() {
		List<Board> boards = new BoardService().selectBoardList();
		return boards;
	}
	
	public Board selectBoard(int boardNo) {
		return new BoardService().selectBoard(boardNo);
	}

	public int deleteBoard(int boardNo) {
		return new BoardService().deleteBoard(boardNo);
	}
}
