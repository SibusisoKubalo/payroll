/**
 * @author Sibusiso Kubalo
 * Student Num: 218316038
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Position;
import java.util.List;

public interface PositionRepository {
    void save(Position position);
    Position findByPositionCode(String positionCode);
    List<Position> findAll();
}