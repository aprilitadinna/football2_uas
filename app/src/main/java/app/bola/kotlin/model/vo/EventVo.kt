package app.bola.kotlin.model.vo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class EventVo (
        var eventId: String? = "",
        var dateEvent: String? = "",
        var time: String?,
        var teamHomeName: String? = "",
        var teamHomeScore: Int?,
        var teamAwayName: String? = "",
        var teamAwayScore: Int?,
        var showReminder: Boolean = false
) : Parcelable {
    constructor() : this(null, null, null, null, null, null, null, false)
}