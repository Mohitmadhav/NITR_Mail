package github.sachin2dehury.nitrmail.api.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import github.sachin2dehury.nitrmail.api.data.Mail
import kotlinx.coroutines.flow.Flow

@Dao
interface MailDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMail(mail: Mail)

    @Query("SELECT * FROM mails WHERE box= :box ORDER BY id DESC")
    fun getAllMails(box: String): Flow<List<Mail>>

    @Query("DELETE FROM mails WHERE id = :mailId")
    suspend fun deleteMailById(mailId: String)
}