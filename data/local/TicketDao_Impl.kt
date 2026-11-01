package com.seminario2026.eventpulse.`data`.local

import androidx.room.EntityInsertAdapter
import androidx.room.RoomDatabase
import androidx.room.coroutines.createFlow
import androidx.room.util.getColumnIndexOrThrow
import androidx.room.util.performSuspending
import androidx.sqlite.SQLiteStatement
import javax.`annotation`.processing.Generated
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.MutableList
import kotlin.collections.mutableListOf
import kotlin.reflect.KClass
import kotlinx.coroutines.flow.Flow

@Generated(value = ["androidx.room.RoomProcessor"])
@Suppress(names = ["UNCHECKED_CAST", "DEPRECATION", "REDUNDANT_PROJECTION", "REMOVAL"])
public class TicketDao_Impl(
  __db: RoomDatabase,
) : TicketDao {
  private val __db: RoomDatabase

  private val __insertAdapterOfTicketEntity: EntityInsertAdapter<TicketEntity>
  init {
    this.__db = __db
    this.__insertAdapterOfTicketEntity = object : EntityInsertAdapter<TicketEntity>() {
      protected override fun createQuery(): String = "INSERT OR REPLACE INTO `tickets` (`ticketId`,`eventId`,`eventTitle`,`date`,`location`,`accessZone`,`qrCodeSeed`,`holderName`) VALUES (?,?,?,?,?,?,?,?)"

      protected override fun bind(statement: SQLiteStatement, entity: TicketEntity) {
        statement.bindText(1, entity.ticketId)
        statement.bindText(2, entity.eventId)
        statement.bindText(3, entity.eventTitle)
        statement.bindText(4, entity.date)
        statement.bindText(5, entity.location)
        statement.bindText(6, entity.accessZone)
        statement.bindText(7, entity.qrCodeSeed)
        statement.bindText(8, entity.holderName)
      }
    }
  }

  public override suspend fun insertTicket(ticket: TicketEntity): Unit = performSuspending(__db, false, true) { _connection ->
    __insertAdapterOfTicketEntity.insert(_connection, ticket)
  }

  public override suspend fun insertTickets(tickets: List<TicketEntity>): Unit = performSuspending(__db, false, true) { _connection ->
    __insertAdapterOfTicketEntity.insert(_connection, tickets)
  }

  public override fun getTickets(): Flow<List<TicketEntity>> {
    val _sql: String = "SELECT * FROM tickets"
    return createFlow(__db, false, arrayOf("tickets")) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        val _columnIndexOfTicketId: Int = getColumnIndexOrThrow(_stmt, "ticketId")
        val _columnIndexOfEventId: Int = getColumnIndexOrThrow(_stmt, "eventId")
        val _columnIndexOfEventTitle: Int = getColumnIndexOrThrow(_stmt, "eventTitle")
        val _columnIndexOfDate: Int = getColumnIndexOrThrow(_stmt, "date")
        val _columnIndexOfLocation: Int = getColumnIndexOrThrow(_stmt, "location")
        val _columnIndexOfAccessZone: Int = getColumnIndexOrThrow(_stmt, "accessZone")
        val _columnIndexOfQrCodeSeed: Int = getColumnIndexOrThrow(_stmt, "qrCodeSeed")
        val _columnIndexOfHolderName: Int = getColumnIndexOrThrow(_stmt, "holderName")
        val _result: MutableList<TicketEntity> = mutableListOf()
        while (_stmt.step()) {
          val _item: TicketEntity
          val _tmpTicketId: String
          _tmpTicketId = _stmt.getText(_columnIndexOfTicketId)
          val _tmpEventId: String
          _tmpEventId = _stmt.getText(_columnIndexOfEventId)
          val _tmpEventTitle: String
          _tmpEventTitle = _stmt.getText(_columnIndexOfEventTitle)
          val _tmpDate: String
          _tmpDate = _stmt.getText(_columnIndexOfDate)
          val _tmpLocation: String
          _tmpLocation = _stmt.getText(_columnIndexOfLocation)
          val _tmpAccessZone: String
          _tmpAccessZone = _stmt.getText(_columnIndexOfAccessZone)
          val _tmpQrCodeSeed: String
          _tmpQrCodeSeed = _stmt.getText(_columnIndexOfQrCodeSeed)
          val _tmpHolderName: String
          _tmpHolderName = _stmt.getText(_columnIndexOfHolderName)
          _item = TicketEntity(_tmpTicketId,_tmpEventId,_tmpEventTitle,_tmpDate,_tmpLocation,_tmpAccessZone,_tmpQrCodeSeed,_tmpHolderName)
          _result.add(_item)
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun getTicketsSync(): List<TicketEntity> {
    val _sql: String = "SELECT * FROM tickets"
    return performSuspending(__db, true, false) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        val _columnIndexOfTicketId: Int = getColumnIndexOrThrow(_stmt, "ticketId")
        val _columnIndexOfEventId: Int = getColumnIndexOrThrow(_stmt, "eventId")
        val _columnIndexOfEventTitle: Int = getColumnIndexOrThrow(_stmt, "eventTitle")
        val _columnIndexOfDate: Int = getColumnIndexOrThrow(_stmt, "date")
        val _columnIndexOfLocation: Int = getColumnIndexOrThrow(_stmt, "location")
        val _columnIndexOfAccessZone: Int = getColumnIndexOrThrow(_stmt, "accessZone")
        val _columnIndexOfQrCodeSeed: Int = getColumnIndexOrThrow(_stmt, "qrCodeSeed")
        val _columnIndexOfHolderName: Int = getColumnIndexOrThrow(_stmt, "holderName")
        val _result: MutableList<TicketEntity> = mutableListOf()
        while (_stmt.step()) {
          val _item: TicketEntity
          val _tmpTicketId: String
          _tmpTicketId = _stmt.getText(_columnIndexOfTicketId)
          val _tmpEventId: String
          _tmpEventId = _stmt.getText(_columnIndexOfEventId)
          val _tmpEventTitle: String
          _tmpEventTitle = _stmt.getText(_columnIndexOfEventTitle)
          val _tmpDate: String
          _tmpDate = _stmt.getText(_columnIndexOfDate)
          val _tmpLocation: String
          _tmpLocation = _stmt.getText(_columnIndexOfLocation)
          val _tmpAccessZone: String
          _tmpAccessZone = _stmt.getText(_columnIndexOfAccessZone)
          val _tmpQrCodeSeed: String
          _tmpQrCodeSeed = _stmt.getText(_columnIndexOfQrCodeSeed)
          val _tmpHolderName: String
          _tmpHolderName = _stmt.getText(_columnIndexOfHolderName)
          _item = TicketEntity(_tmpTicketId,_tmpEventId,_tmpEventTitle,_tmpDate,_tmpLocation,_tmpAccessZone,_tmpQrCodeSeed,_tmpHolderName)
          _result.add(_item)
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun getTicketCount(): Int {
    val _sql: String = "SELECT COUNT(*) FROM tickets"
    return performSuspending(__db, true, false) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        val _result: Int
        if (_stmt.step()) {
          val _tmp: Int
          _tmp = _stmt.getLong(0).toInt()
          _result = _tmp
        } else {
          _result = 0
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  public companion object {
    public fun getRequiredConverters(): List<KClass<*>> = emptyList()
  }
}
