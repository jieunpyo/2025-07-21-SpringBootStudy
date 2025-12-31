package com.sist.web.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.sist.web.mapper.BoardMapper;
import com.sist.web.vo.BoardVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

	private final BoardMapper bMapper;

	@Override
	public List<BoardVO> boardListData(int start) {
		// TODO Auto-generated method stub
		return bMapper.boardListData(start);
	}

	@Override
	public int boardTotalpage() {
		// TODO Auto-generated method stub
		return bMapper.boardTotalpage();
	}

	@Override
	public void boardInsert(BoardVO vo) {
		// TODO Auto-generated method stub
		bMapper.boardInsert(vo);
	}

	@Override
	public BoardVO boardDetailData(int no) {
		// TODO Auto-generated method stub
		bMapper.boardHitIncrement(no);
		return bMapper.boardDetailData(no);
	}

	@Override
	public void boardDelete(int no) {
		// TODO Auto-generated method stub
		bMapper.boardDelete(no);
	}

	@Override
	public void boardUpdate(BoardVO vo) {
		// TODO Auto-generated method stub
		bMapper.boardUpdate(0);
	}

}
