package dev.alanryan.api.databases.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.UniqueConstraint
import org.hibernate.annotations.CreationTimestamp
import java.time.Instant
import java.util.UUID

@Entity
@Table(
    name = "cupons",
    uniqueConstraints = [
        UniqueConstraint(name = "uk_cupons_code", columnNames = ["code"]),
        UniqueConstraint(name = "uk_cupons_owner", columnNames = ["owner"])
    ]
)
class CupomEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID? = null,

    @Column(nullable = false)
    var code: String,

    @Column(nullable = false)
    var owner: String,

    @Column(nullable = false)
    var clicks: Int,

    @CreationTimestamp
    var createdAt: Instant = Instant.now()
)
