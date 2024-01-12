/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main.tables.records


import java.time.OffsetDateTime

import link.kotlin.server.jooq.main.enums.ReadStateEnum
import link.kotlin.server.jooq.main.tables.KotlinerReadEntityState

import org.jooq.Record2
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class KotlinerReadEntityStateRecord() : UpdatableRecordImpl<KotlinerReadEntityStateRecord>(KotlinerReadEntityState.KOTLINER_READ_ENTITY_STATE) {

    open var kotlinerId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var entityId: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var readState: ReadStateEnum?
        set(value): Unit = set(2, value)
        get(): ReadStateEnum? = get(2) as ReadStateEnum?

    open var created: OffsetDateTime?
        set(value): Unit = set(3, value)
        get(): OffsetDateTime? = get(3) as OffsetDateTime?

    open var updated: OffsetDateTime?
        set(value): Unit = set(4, value)
        get(): OffsetDateTime? = get(4) as OffsetDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<Long?, Long?> = super.key() as Record2<Long?, Long?>

    /**
     * Create a detached, initialised KotlinerReadEntityStateRecord
     */
    constructor(kotlinerId: Long? = null, entityId: Long? = null, readState: ReadStateEnum? = null, created: OffsetDateTime? = null, updated: OffsetDateTime? = null): this() {
        this.kotlinerId = kotlinerId
        this.entityId = entityId
        this.readState = readState
        this.created = created
        this.updated = updated
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised KotlinerReadEntityStateRecord
     */
    constructor(value: link.kotlin.server.jooq.main.tables.pojos.KotlinerReadEntityState?): this() {
        if (value != null) {
            this.kotlinerId = value.kotlinerId
            this.entityId = value.entityId
            this.readState = value.readState
            this.created = value.created
            this.updated = value.updated
            resetChangedOnNotNull()
        }
    }
}