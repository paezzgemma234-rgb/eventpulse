package com.seminario2026.eventpulse.`data`.local

import androidx.room.EntityInsertAdapter
import androidx.room.RoomDatabase
import androidx.room.coroutines.createFlow
import androidx.room.util.getColumnIndexOrThrow
import androidx.room.util.performSuspending
import androidx.sqlite.SQLiteStatement
import com.seminario2026.eventpulse.model.Artist
import com.seminario2026.eventpulse.model.Category
import com.seminario2026.eventpulse.model.StageSchedule
import javax.`annotation`.processing.Generated
import kotlin.Boolean
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
public class EventDao_Impl(
  __db: RoomDatabase,
) : EventDao {
  private val __db: RoomDatabase

  private val __insertAdapterOfEventEntity: EntityInsertAdapter<EventEntity>

  private val __converters: Converters = Converters()
  init {
    this.__db = __db
    this.__insertAdapterOfEventEntity = object : EntityInsertAdapter<EventEntity>() {
      protected override fun createQuery(): String = "INSERT OR REPLACE INTO `events` (`id`,`title`,`subtitle`,`category`,`date`,`location`,`imageUrl`,`isLive`,`isFeatured`,`description`,`price`,`artists`,`stages`,`isFavorite`,`hasPass`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

      protected override fun bind(statement: SQLiteStatement, entity: EventEntity) {
        statement.bindText(1, entity.id)
        statement.bindText(2, entity.title)
        statement.bindText(3, entity.subtitle)
        val _tmp: String = __converters.fromCategory(entity.category)
        statement.bindText(4, _tmp)
        statement.bindText(5, entity.date)
        statement.bindText(6, entity.location)
        statement.bindText(7, entity.imageUrl)
        val _tmp_1: Int = if (entity.isLive) 1 else 0
        statement.bindLong(8, _tmp_1.toLong())
        val _tmp_2: Int = if (entity.isFeatured) 1 else 0
        statement.bindLong(9, _tmp_2.toLong())
        statement.bindText(10, entity.description)
        statement.bindText(11, entity.price)
        val _tmp_3: String = __converters.fromArtistList(entity.artists)
        statement.bindText(12, _tmp_3)
        val _tmp_4: String = __converters.fromStageScheduleList(entity.stages)
        statement.bindText(13, _tmp_4)
        val _tmp_5: Int = if (entity.isFavorite) 1 else 0
        statement.bindLong(14, _tmp_5.toLong())
        val _tmp_6: Int = if (entity.hasPass) 1 else 0
        statement.bindLong(15, _tmp_6.toLong())
      }
    }
  }

  public override suspend fun insertEvents(events: List<EventEntity>): Unit = performSuspending(__db, false, true) { _connection ->
    __insertAdapterOfEventEntity.insert(_connection, events)
  }

  public override suspend fun insertEvent(event: EventEntity): Unit = performSuspending(__db, false, true) { _connection ->
    __insertAdapterOfEventEntity.insert(_connection, event)
  }

  public override fun getEvents(): Flow<List<EventEntity>> {
    val _sql: String = "SELECT * FROM events"
    return createFlow(__db, false, arrayOf("events")) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        val _columnIndexOfId: Int = getColumnIndexOrThrow(_stmt, "id")
        val _columnIndexOfTitle: Int = getColumnIndexOrThrow(_stmt, "title")
        val _columnIndexOfSubtitle: Int = getColumnIndexOrThrow(_stmt, "subtitle")
        val _columnIndexOfCategory: Int = getColumnIndexOrThrow(_stmt, "category")
        val _columnIndexOfDate: Int = getColumnIndexOrThrow(_stmt, "date")
        val _columnIndexOfLocation: Int = getColumnIndexOrThrow(_stmt, "location")
        val _columnIndexOfImageUrl: Int = getColumnIndexOrThrow(_stmt, "imageUrl")
        val _columnIndexOfIsLive: Int = getColumnIndexOrThrow(_stmt, "isLive")
        val _columnIndexOfIsFeatured: Int = getColumnIndexOrThrow(_stmt, "isFeatured")
        val _columnIndexOfDescription: Int = getColumnIndexOrThrow(_stmt, "description")
        val _columnIndexOfPrice: Int = getColumnIndexOrThrow(_stmt, "price")
        val _columnIndexOfArtists: Int = getColumnIndexOrThrow(_stmt, "artists")
        val _columnIndexOfStages: Int = getColumnIndexOrThrow(_stmt, "stages")
        val _columnIndexOfIsFavorite: Int = getColumnIndexOrThrow(_stmt, "isFavorite")
        val _columnIndexOfHasPass: Int = getColumnIndexOrThrow(_stmt, "hasPass")
        val _result: MutableList<EventEntity> = mutableListOf()
        while (_stmt.step()) {
          val _item: EventEntity
          val _tmpId: String
          _tmpId = _stmt.getText(_columnIndexOfId)
          val _tmpTitle: String
          _tmpTitle = _stmt.getText(_columnIndexOfTitle)
          val _tmpSubtitle: String
          _tmpSubtitle = _stmt.getText(_columnIndexOfSubtitle)
          val _tmpCategory: Category
          val _tmp: String
          _tmp = _stmt.getText(_columnIndexOfCategory)
          _tmpCategory = __converters.toCategory(_tmp)
          val _tmpDate: String
          _tmpDate = _stmt.getText(_columnIndexOfDate)
          val _tmpLocation: String
          _tmpLocation = _stmt.getText(_columnIndexOfLocation)
          val _tmpImageUrl: String
          _tmpImageUrl = _stmt.getText(_columnIndexOfImageUrl)
          val _tmpIsLive: Boolean
          val _tmp_1: Int
          _tmp_1 = _stmt.getLong(_columnIndexOfIsLive).toInt()
          _tmpIsLive = _tmp_1 != 0
          val _tmpIsFeatured: Boolean
          val _tmp_2: Int
          _tmp_2 = _stmt.getLong(_columnIndexOfIsFeatured).toInt()
          _tmpIsFeatured = _tmp_2 != 0
          val _tmpDescription: String
          _tmpDescription = _stmt.getText(_columnIndexOfDescription)
          val _tmpPrice: String
          _tmpPrice = _stmt.getText(_columnIndexOfPrice)
          val _tmpArtists: List<Artist>
          val _tmp_3: String
          _tmp_3 = _stmt.getText(_columnIndexOfArtists)
          _tmpArtists = __converters.toArtistList(_tmp_3)
          val _tmpStages: List<StageSchedule>
          val _tmp_4: String
          _tmp_4 = _stmt.getText(_columnIndexOfStages)
          _tmpStages = __converters.toStageScheduleList(_tmp_4)
          val _tmpIsFavorite: Boolean
          val _tmp_5: Int
          _tmp_5 = _stmt.getLong(_columnIndexOfIsFavorite).toInt()
          _tmpIsFavorite = _tmp_5 != 0
          val _tmpHasPass: Boolean
          val _tmp_6: Int
          _tmp_6 = _stmt.getLong(_columnIndexOfHasPass).toInt()
          _tmpHasPass = _tmp_6 != 0
          _item = EventEntity(_tmpId,_tmpTitle,_tmpSubtitle,_tmpCategory,_tmpDate,_tmpLocation,_tmpImageUrl,_tmpIsLive,_tmpIsFeatured,_tmpDescription,_tmpPrice,_tmpArtists,_tmpStages,_tmpIsFavorite,_tmpHasPass)
          _result.add(_item)
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun getEventsSync(): List<EventEntity> {
    val _sql: String = "SELECT * FROM events"
    return performSuspending(__db, true, false) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        val _columnIndexOfId: Int = getColumnIndexOrThrow(_stmt, "id")
        val _columnIndexOfTitle: Int = getColumnIndexOrThrow(_stmt, "title")
        val _columnIndexOfSubtitle: Int = getColumnIndexOrThrow(_stmt, "subtitle")
        val _columnIndexOfCategory: Int = getColumnIndexOrThrow(_stmt, "category")
        val _columnIndexOfDate: Int = getColumnIndexOrThrow(_stmt, "date")
        val _columnIndexOfLocation: Int = getColumnIndexOrThrow(_stmt, "location")
        val _columnIndexOfImageUrl: Int = getColumnIndexOrThrow(_stmt, "imageUrl")
        val _columnIndexOfIsLive: Int = getColumnIndexOrThrow(_stmt, "isLive")
        val _columnIndexOfIsFeatured: Int = getColumnIndexOrThrow(_stmt, "isFeatured")
        val _columnIndexOfDescription: Int = getColumnIndexOrThrow(_stmt, "description")
        val _columnIndexOfPrice: Int = getColumnIndexOrThrow(_stmt, "price")
        val _columnIndexOfArtists: Int = getColumnIndexOrThrow(_stmt, "artists")
        val _columnIndexOfStages: Int = getColumnIndexOrThrow(_stmt, "stages")
        val _columnIndexOfIsFavorite: Int = getColumnIndexOrThrow(_stmt, "isFavorite")
        val _columnIndexOfHasPass: Int = getColumnIndexOrThrow(_stmt, "hasPass")
        val _result: MutableList<EventEntity> = mutableListOf()
        while (_stmt.step()) {
          val _item: EventEntity
          val _tmpId: String
          _tmpId = _stmt.getText(_columnIndexOfId)
          val _tmpTitle: String
          _tmpTitle = _stmt.getText(_columnIndexOfTitle)
          val _tmpSubtitle: String
          _tmpSubtitle = _stmt.getText(_columnIndexOfSubtitle)
          val _tmpCategory: Category
          val _tmp: String
          _tmp = _stmt.getText(_columnIndexOfCategory)
          _tmpCategory = __converters.toCategory(_tmp)
          val _tmpDate: String
          _tmpDate = _stmt.getText(_columnIndexOfDate)
          val _tmpLocation: String
          _tmpLocation = _stmt.getText(_columnIndexOfLocation)
          val _tmpImageUrl: String
          _tmpImageUrl = _stmt.getText(_columnIndexOfImageUrl)
          val _tmpIsLive: Boolean
          val _tmp_1: Int
          _tmp_1 = _stmt.getLong(_columnIndexOfIsLive).toInt()
          _tmpIsLive = _tmp_1 != 0
          val _tmpIsFeatured: Boolean
          val _tmp_2: Int
          _tmp_2 = _stmt.getLong(_columnIndexOfIsFeatured).toInt()
          _tmpIsFeatured = _tmp_2 != 0
          val _tmpDescription: String
          _tmpDescription = _stmt.getText(_columnIndexOfDescription)
          val _tmpPrice: String
          _tmpPrice = _stmt.getText(_columnIndexOfPrice)
          val _tmpArtists: List<Artist>
          val _tmp_3: String
          _tmp_3 = _stmt.getText(_columnIndexOfArtists)
          _tmpArtists = __converters.toArtistList(_tmp_3)
          val _tmpStages: List<StageSchedule>
          val _tmp_4: String
          _tmp_4 = _stmt.getText(_columnIndexOfStages)
          _tmpStages = __converters.toStageScheduleList(_tmp_4)
          val _tmpIsFavorite: Boolean
          val _tmp_5: Int
          _tmp_5 = _stmt.getLong(_columnIndexOfIsFavorite).toInt()
          _tmpIsFavorite = _tmp_5 != 0
          val _tmpHasPass: Boolean
          val _tmp_6: Int
          _tmp_6 = _stmt.getLong(_columnIndexOfHasPass).toInt()
          _tmpHasPass = _tmp_6 != 0
          _item = EventEntity(_tmpId,_tmpTitle,_tmpSubtitle,_tmpCategory,_tmpDate,_tmpLocation,_tmpImageUrl,_tmpIsLive,_tmpIsFeatured,_tmpDescription,_tmpPrice,_tmpArtists,_tmpStages,_tmpIsFavorite,_tmpHasPass)
          _result.add(_item)
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun getEventById(id: String): EventEntity? {
    val _sql: String = "SELECT * FROM events WHERE id = ?"
    return performSuspending(__db, true, false) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        var _argIndex: Int = 1
        _stmt.bindText(_argIndex, id)
        val _columnIndexOfId: Int = getColumnIndexOrThrow(_stmt, "id")
        val _columnIndexOfTitle: Int = getColumnIndexOrThrow(_stmt, "title")
        val _columnIndexOfSubtitle: Int = getColumnIndexOrThrow(_stmt, "subtitle")
        val _columnIndexOfCategory: Int = getColumnIndexOrThrow(_stmt, "category")
        val _columnIndexOfDate: Int = getColumnIndexOrThrow(_stmt, "date")
        val _columnIndexOfLocation: Int = getColumnIndexOrThrow(_stmt, "location")
        val _columnIndexOfImageUrl: Int = getColumnIndexOrThrow(_stmt, "imageUrl")
        val _columnIndexOfIsLive: Int = getColumnIndexOrThrow(_stmt, "isLive")
        val _columnIndexOfIsFeatured: Int = getColumnIndexOrThrow(_stmt, "isFeatured")
        val _columnIndexOfDescription: Int = getColumnIndexOrThrow(_stmt, "description")
        val _columnIndexOfPrice: Int = getColumnIndexOrThrow(_stmt, "price")
        val _columnIndexOfArtists: Int = getColumnIndexOrThrow(_stmt, "artists")
        val _columnIndexOfStages: Int = getColumnIndexOrThrow(_stmt, "stages")
        val _columnIndexOfIsFavorite: Int = getColumnIndexOrThrow(_stmt, "isFavorite")
        val _columnIndexOfHasPass: Int = getColumnIndexOrThrow(_stmt, "hasPass")
        val _result: EventEntity?
        if (_stmt.step()) {
          val _tmpId: String
          _tmpId = _stmt.getText(_columnIndexOfId)
          val _tmpTitle: String
          _tmpTitle = _stmt.getText(_columnIndexOfTitle)
          val _tmpSubtitle: String
          _tmpSubtitle = _stmt.getText(_columnIndexOfSubtitle)
          val _tmpCategory: Category
          val _tmp: String
          _tmp = _stmt.getText(_columnIndexOfCategory)
          _tmpCategory = __converters.toCategory(_tmp)
          val _tmpDate: String
          _tmpDate = _stmt.getText(_columnIndexOfDate)
          val _tmpLocation: String
          _tmpLocation = _stmt.getText(_columnIndexOfLocation)
          val _tmpImageUrl: String
          _tmpImageUrl = _stmt.getText(_columnIndexOfImageUrl)
          val _tmpIsLive: Boolean
          val _tmp_1: Int
          _tmp_1 = _stmt.getLong(_columnIndexOfIsLive).toInt()
          _tmpIsLive = _tmp_1 != 0
          val _tmpIsFeatured: Boolean
          val _tmp_2: Int
          _tmp_2 = _stmt.getLong(_columnIndexOfIsFeatured).toInt()
          _tmpIsFeatured = _tmp_2 != 0
          val _tmpDescription: String
          _tmpDescription = _stmt.getText(_columnIndexOfDescription)
          val _tmpPrice: String
          _tmpPrice = _stmt.getText(_columnIndexOfPrice)
          val _tmpArtists: List<Artist>
          val _tmp_3: String
          _tmp_3 = _stmt.getText(_columnIndexOfArtists)
          _tmpArtists = __converters.toArtistList(_tmp_3)
          val _tmpStages: List<StageSchedule>
          val _tmp_4: String
          _tmp_4 = _stmt.getText(_columnIndexOfStages)
          _tmpStages = __converters.toStageScheduleList(_tmp_4)
          val _tmpIsFavorite: Boolean
          val _tmp_5: Int
          _tmp_5 = _stmt.getLong(_columnIndexOfIsFavorite).toInt()
          _tmpIsFavorite = _tmp_5 != 0
          val _tmpHasPass: Boolean
          val _tmp_6: Int
          _tmp_6 = _stmt.getLong(_columnIndexOfHasPass).toInt()
          _tmpHasPass = _tmp_6 != 0
          _result = EventEntity(_tmpId,_tmpTitle,_tmpSubtitle,_tmpCategory,_tmpDate,_tmpLocation,_tmpImageUrl,_tmpIsLive,_tmpIsFeatured,_tmpDescription,_tmpPrice,_tmpArtists,_tmpStages,_tmpIsFavorite,_tmpHasPass)
        } else {
          _result = null
        }
        _result
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun getEventCount(): Int {
    val _sql: String = "SELECT COUNT(*) FROM events"
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

  public override suspend fun updateFavorite(eventId: String, isFavorite: Boolean) {
    val _sql: String = "UPDATE events SET isFavorite = ? WHERE id = ?"
    return performSuspending(__db, false, true) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        var _argIndex: Int = 1
        val _tmp: Int = if (isFavorite) 1 else 0
        _stmt.bindLong(_argIndex, _tmp.toLong())
        _argIndex = 2
        _stmt.bindText(_argIndex, eventId)
        _stmt.step()
      } finally {
        _stmt.close()
      }
    }
  }

  public override suspend fun updateHasPass(eventId: String, hasPass: Boolean) {
    val _sql: String = "UPDATE events SET hasPass = ? WHERE id = ?"
    return performSuspending(__db, false, true) { _connection ->
      val _stmt: SQLiteStatement = _connection.prepare(_sql)
      try {
        var _argIndex: Int = 1
        val _tmp: Int = if (hasPass) 1 else 0
        _stmt.bindLong(_argIndex, _tmp.toLong())
        _argIndex = 2
        _stmt.bindText(_argIndex, eventId)
        _stmt.step()
      } finally {
        _stmt.close()
      }
    }
  }

  public companion object {
    public fun getRequiredConverters(): List<KClass<*>> = emptyList()
  }
}
