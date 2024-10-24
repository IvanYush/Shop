package org.example;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * Лекарство
 */
@ToString(callSuper = true)
public class Drug extends Product {
    @NonNull
    @Getter
    @Setter
    private Boolean isPrescription;

    public Drug(@NonNull String name, @NonNull BigDecimal price, @NonNull Boolean isPrescription) {
        super(name, price);
        this.isPrescription = isPrescription;
    }
}
