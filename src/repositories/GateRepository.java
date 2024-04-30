package repositories;

import models.Gates;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Long, Gates> gates = new HashMap<>();

    public Optional<Gates> findById(Long gateId) {
        if (gates.containsKey(gateId)) {
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}