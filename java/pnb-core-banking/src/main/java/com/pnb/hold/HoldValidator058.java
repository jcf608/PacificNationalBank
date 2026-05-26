package com.pnb.hold;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 * HoldValidator058 — Business rule validation.
 */
@ApplicationScoped
public class HoldValidator058 {

    public List<String> validate(HoldDto058 dto) {
        List<String> errors = new ArrayList<>();
        if (dto == null) {
            errors.add("hold DTO must not be null");
            return errors;
        }
        if (dto.getHoldField002() != null && dto.getHoldField002().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField002 must not be negative");
        }
        if (dto.getHoldField014() != null && dto.getHoldField014().compareTo(BigDecimal.ZERO) < 0) {
            errors.add("holdField014 must not be negative");
        }
        if (dto.getHoldField016() != null && dto.getHoldField016().isBlank()) {
            errors.add("holdField016 must not be blank if provided");
        }
        if (dto.getHoldField017() != null && dto.getHoldField017().isBlank()) {
            errors.add("holdField017 must not be blank if provided");
        }
        return errors;
    }
}
