package site.metacoding.entitytest.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.entitytest.domain.Board;
import site.metacoding.entitytest.domain.BoardRepository;
import site.metacoding.entitytest.domain.BoardimplRepository;
import site.metacoding.entitytest.web.dto.BoardDetailRespDto;
import site.metacoding.entitytest.web.dto.BoardRespDto;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository; // API
    private final BoardimplRepository boardimplRepository; // JPQL

    public BoardRespDto 상세보기(Integer id) {
        Board boardEntity = boardRepository.findById(id).get();

        BoardRespDto dto = new BoardRespDto(boardEntity.getId(), boardEntity.getTitle(), boardEntity.getContent());

        return dto;
    }

    public BoardDetailRespDto 좋아요포함상세보기(Integer id) {
        return boardimplRepository.mFindDetail(id);
    }
}