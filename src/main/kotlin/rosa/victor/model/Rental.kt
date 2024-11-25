package rosa.victor.model

import java.time.LocalDate

data class Rental(
    val id: Long,
    val userId: String,
    val reservationId: Long,
    val startDate: LocalDate,
)
