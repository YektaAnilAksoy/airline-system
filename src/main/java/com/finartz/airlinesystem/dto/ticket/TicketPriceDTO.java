package com.finartz.airlinesystem.dto.ticket;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Yekta Anil AKSOY
 * @since : 2.02.2021
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketPriceDTO implements Serializable {

    private Long sold;
    private Integer capacity;
    private BigDecimal price;
}
