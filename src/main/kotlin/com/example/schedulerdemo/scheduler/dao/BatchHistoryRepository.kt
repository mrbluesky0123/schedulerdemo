package com.example.schedulerdemo.scheduler.dao

import com.example.schedulerdemo.scheduler.entity.BatchHistory
import org.springframework.data.jpa.repository.JpaRepository

interface BatchHistoryRepository: JpaRepository<BatchHistory, Long> {
    fun findBatchHistoriesByBatchExecDateAndBatchProgramId(batchExecDate: String, batchProgramId: String):
            List<BatchHistory>
}