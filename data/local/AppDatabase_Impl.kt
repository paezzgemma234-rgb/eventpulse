package com.seminario2026.eventpulse.`data`.local

import androidx.room.InvalidationTracker
import androidx.room.RoomOpenDelegate
import androidx.room.migration.AutoMigrationSpec
import androidx.room.migration.Migration
import androidx.room.util.TableInfo
import androidx.room.util.TableInfo.Companion.read
import androidx.room.util.dropFtsSyncTriggers
import androidx.sqlite.SQLiteConnection
import androidx.sqlite.execSQL
import javax.`annotation`.processing.Generated
import kotlin.Lazy
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList
import kotlin.collections.MutableMap
import kotlin.collections.MutableSet
import kotlin.collections.Set
import kotlin.collections.mutableListOf
import kotlin.collections.mutableMapOf
import kotlin.collections.mutableSetOf
import kotlin.reflect.KClass

@Generated(value = ["androidx.room.RoomProcessor"])
@Suppress(names = ["UNCHECKED_CAST", "DEPRECATION", "REDUNDANT_PROJECTION", "REMOVAL"])
public class AppDatabase_Impl : AppDatabase() {
  private val _eventDao: Lazy<EventDao> = lazy {
    EventDao_Impl(this)
  }

  private val _ticketDao: Lazy<TicketDao> = lazy {
    TicketDao_Impl(this)
  }

  protected override fun createOpenDelegate(): RoomOpenDelegate {
    val _openDelegate: RoomOpenDelegate = object : RoomOpenDelegate(1, "05eefff2a902f89d8d527d9bc7ec52a5", "45737799404189c68d0f3243c1355723") {
      public override fun createAllTables(connection: SQLiteConnection) {
        connection.execSQL("CREATE TABLE IF NOT EXISTS `events` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT NOT NULL, `category` TEXT NOT NULL, `date` TEXT NOT NULL, `location` TEXT NOT NULL, `imageUrl` TEXT NOT NULL, `isLive` INTEGER NOT NULL, `isFeatured` INTEGER NOT NULL, `description` TEXT NOT NULL, `price` TEXT NOT NULL, `artists` TEXT NOT NULL, `stages` TEXT NOT NULL, `isFavorite` INTEGER NOT NULL, `hasPass` INTEGER NOT NULL, PRIMARY KEY(`id`))")
        connection.execSQL("CREATE TABLE IF NOT EXISTS `tickets` (`ticketId` TEXT NOT NULL, `eventId` TEXT NOT NULL, `eventTitle` TEXT NOT NULL, `date` TEXT NOT NULL, `location` TEXT NOT NULL, `accessZone` TEXT NOT NULL, `qrCodeSeed` TEXT NOT NULL, `holderName` TEXT NOT NULL, PRIMARY KEY(`ticketId`))")
        connection.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)")
        connection.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '05eefff2a902f89d8d527d9bc7ec52a5')")
      }

      public override fun dropAllTables(connection: SQLiteConnection) {
        connection.execSQL("DROP TABLE IF EXISTS `events`")
        connection.execSQL("DROP TABLE IF EXISTS `tickets`")
      }

      public override fun onCreate(connection: SQLiteConnection) {
      }

      public override fun onOpen(connection: SQLiteConnection) {
        internalInitInvalidationTracker(connection)
      }

      public override fun onPreMigrate(connection: SQLiteConnection) {
        dropFtsSyncTriggers(connection)
      }

      public override fun onPostMigrate(connection: SQLiteConnection) {
      }

      public override fun onValidateSchema(connection: SQLiteConnection): RoomOpenDelegate.ValidationResult {
        val _columnsEvents: MutableMap<String, TableInfo.Column> = mutableMapOf()
        _columnsEvents.put("id", TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsEvents.put("title", TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsEvents.put("subtitle", TableInfo.Column("subtitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsEvents.put("category", TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsEvents.put("date", TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsEvents.put("location", TableInfo.Column("location", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsEvents.put("imageUrl", TableInfo.Column("imageUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsEvents.put("isLive", TableInfo.Column("isLive", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsEvents.put("isFeatured", TableInfo.Column("isFeatured", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsEvents.put("description", TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsEvents.put("price", TableInfo.Column("price", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsEvents.put("artists", TableInfo.Column("artists", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsEvents.put("stages", TableInfo.Column("stages", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsEvents.put("isFavorite", TableInfo.Column("isFavorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsEvents.put("hasPass", TableInfo.Column("hasPass", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        val _foreignKeysEvents: MutableSet<TableInfo.ForeignKey> = mutableSetOf()
        val _indicesEvents: MutableSet<TableInfo.Index> = mutableSetOf()
        val _infoEvents: TableInfo = TableInfo("events", _columnsEvents, _foreignKeysEvents, _indicesEvents)
        val _existingEvents: TableInfo = read(connection, "events")
        if (!_infoEvents.equals(_existingEvents)) {
          return RoomOpenDelegate.ValidationResult(false, """
              |events(com.seminario2026.eventpulse.data.local.EventEntity).
              | Expected:
              |""".trimMargin() + _infoEvents + """
              |
              | Found:
              |""".trimMargin() + _existingEvents)
        }
        val _columnsTickets: MutableMap<String, TableInfo.Column> = mutableMapOf()
        _columnsTickets.put("ticketId", TableInfo.Column("ticketId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsTickets.put("eventId", TableInfo.Column("eventId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsTickets.put("eventTitle", TableInfo.Column("eventTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsTickets.put("date", TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsTickets.put("location", TableInfo.Column("location", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsTickets.put("accessZone", TableInfo.Column("accessZone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsTickets.put("qrCodeSeed", TableInfo.Column("qrCodeSeed", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        _columnsTickets.put("holderName", TableInfo.Column("holderName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY))
        val _foreignKeysTickets: MutableSet<TableInfo.ForeignKey> = mutableSetOf()
        val _indicesTickets: MutableSet<TableInfo.Index> = mutableSetOf()
        val _infoTickets: TableInfo = TableInfo("tickets", _columnsTickets, _foreignKeysTickets, _indicesTickets)
        val _existingTickets: TableInfo = read(connection, "tickets")
        if (!_infoTickets.equals(_existingTickets)) {
          return RoomOpenDelegate.ValidationResult(false, """
              |tickets(com.seminario2026.eventpulse.data.local.TicketEntity).
              | Expected:
              |""".trimMargin() + _infoTickets + """
              |
              | Found:
              |""".trimMargin() + _existingTickets)
        }
        return RoomOpenDelegate.ValidationResult(true, null)
      }
    }
    return _openDelegate
  }

  protected override fun createInvalidationTracker(): InvalidationTracker {
    val _shadowTablesMap: MutableMap<String, String> = mutableMapOf()
    val _viewTables: MutableMap<String, Set<String>> = mutableMapOf()
    return InvalidationTracker(this, _shadowTablesMap, _viewTables, "events", "tickets")
  }

  public override fun clearAllTables() {
    super.performClear(false, "events", "tickets")
  }

  protected override fun getRequiredTypeConverterClasses(): Map<KClass<*>, List<KClass<*>>> {
    val _typeConvertersMap: MutableMap<KClass<*>, List<KClass<*>>> = mutableMapOf()
    _typeConvertersMap.put(EventDao::class, EventDao_Impl.getRequiredConverters())
    _typeConvertersMap.put(TicketDao::class, TicketDao_Impl.getRequiredConverters())
    return _typeConvertersMap
  }

  public override fun getRequiredAutoMigrationSpecClasses(): Set<KClass<out AutoMigrationSpec>> {
    val _autoMigrationSpecsSet: MutableSet<KClass<out AutoMigrationSpec>> = mutableSetOf()
    return _autoMigrationSpecsSet
  }

  public override fun createAutoMigrations(autoMigrationSpecs: Map<KClass<out AutoMigrationSpec>, AutoMigrationSpec>): List<Migration> {
    val _autoMigrations: MutableList<Migration> = mutableListOf()
    return _autoMigrations
  }

  public override fun eventDao(): EventDao = _eventDao.value

  public override fun ticketDao(): TicketDao = _ticketDao.value
}
