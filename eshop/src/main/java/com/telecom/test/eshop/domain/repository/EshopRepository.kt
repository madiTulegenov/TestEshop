package com.telecom.test.eshop.domain.repository

import com.telecom.test.eshop.domain.model.Category

interface EshopRepository {

    fun getCategories(): List<Category>
}