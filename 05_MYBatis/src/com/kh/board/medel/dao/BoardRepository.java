package com.kh.board.medel.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.board.medel.vo.Board;

public class BoardRepository {

	public List<Board> selectBoardList(SqlSession session) {
		return session.selectList("boardMapper.selectBoardList");
	}
	
	public Board selectBoard(SqlSession session, int boardNo) {
		return session.selectOne("boardMapper.selectBoard");
	}
}
