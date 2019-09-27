package com.arildojr.data.event

import com.arildojr.data.event.model.Event

interface EventRepository {

    suspend fun getEvents() : List<Event>
}