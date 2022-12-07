package flynnoh.hycu.Board.domain.repository;

import flynnoh.hycu.Board.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}