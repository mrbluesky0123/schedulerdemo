package com.example.schedulerdemo.scheduler.dao

import com.example.schedulerdemo.scheduler.entity.BatchInfo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BatchInfoRepository: JpaRepository<BatchInfo, String> {

    // "배치 수행 시간이 현재시간 이전인" 사용 가능한 배치 리스트 find
    fun findBatchInfosByUseYnAndBatchExecDivisionCodeAndBatchExecPeriodValueLessThanEqual(
        useYn: String, batchExecDivisionCode: String, batchExecPeriod: String): List<BatchInfo>
}