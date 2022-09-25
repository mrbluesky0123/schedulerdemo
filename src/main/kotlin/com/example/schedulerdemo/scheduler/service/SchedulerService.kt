package com.example.schedulerdemo.scheduler.service

import com.example.schedulerdemo.scheduler.dao.BatchHistoryRepository
import com.example.schedulerdemo.scheduler.dao.BatchInfoRepository
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Service
class SchedulerService(val batchInfoRepository: BatchInfoRepository,
                       val batchHistoryRepository: BatchHistoryRepository) {

    fun execScheduledBatch() {
        // "배치 수행 시간이 현재시간 이전인 사용 가능한" 배치 리스트 find
        val nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss"))
        val generalBatches = batchInfoRepository
            .findBatchInfosByUseYnAndBatchExecDivisionCodeAndBatchExecPeriodValueLessThanEqual(
                useYn = "Y",
                batchExecDivisionCode = "G",
                batchExecPeriod = nowTime
            )
        // in loop
        // 상주배치인가? - 걍 돌림
        // 돌릴 시간이 맞는가?
        // 맞으면
            // 기수행 내역 검색 (직접 호출 제외 기수행내역 있으면 못돌림)
        // 아니면
            // 파일 유입 배치인가?
            // 파일이 들어왔는가?

        // 맞으면: 파일이 유입되어야 하는데 들어왔는가?
        // 맞으면 - 파일 들어 왔는가?
        //
    }

}