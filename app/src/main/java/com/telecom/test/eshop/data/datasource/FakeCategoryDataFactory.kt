package com.telecom.test.eshop.data.datasource

import com.telecom.test.eshop.domain.model.Category

class FakeCategoryDataFactory {

    fun getCategories() = listOf(
        getCategory(Math.random()),
        getCategory(Math.random()),
        getCategory(Math.random()),
    )

    private fun getCategory(id: Double) = Category(
        id = id.toString(),
        name = "category #$id",
        description = "unknown_random_category_description"
    )
}