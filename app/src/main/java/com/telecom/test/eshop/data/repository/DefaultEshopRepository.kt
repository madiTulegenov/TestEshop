package com.telecom.test.eshop.data.repository

import com.telecom.test.eshop.data.datasource.FakeCategoryDataFactory
import com.telecom.test.eshop.domain.model.Category
import com.telecom.test.eshop.domain.repository.EshopRepository

class DefaultEshopRepository(
    private val fakeCategoryDataFactory: FakeCategoryDataFactory
): EshopRepository {

    override fun getCategories(): List<Category> {
        return fakeCategoryDataFactory.getCategories()
    }
}