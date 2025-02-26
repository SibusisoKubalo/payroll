/**
 * @author Sibusiso Kubalo
 * Student Num: 218316038
 */
package za.ac.cput.service;

import za.ac.cput.domain.Position;
import za.ac.cput.repository.PositionRepository;
import java.util.List;

public class PositionService {
    private final PositionRepository positionRepository;

    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    public void addPosition(Position position) {
        positionRepository.save(position);
    }

    public Position getPositionByCode(String positionCode) {
        return positionRepository.findByPositionCode(positionCode);
    }

    public List<Position> getAllPositions() {
        return positionRepository.findAll();
    }
}