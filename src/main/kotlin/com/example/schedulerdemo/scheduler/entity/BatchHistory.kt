package com.example.schedulerdemo.scheduler.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Id

class BatchHistory(
    @Column(name="PUB_MDB_BAT_EXEC_SEQNO")
    @Id
    val publicMyDataBatchExecSequenceNo: Long,

    @Column(name="BAT_EXEC_DT")
    val batchExecDate: String,

    @Column(name="BAT_PGM_ID")
    val batchProgramId: String,

    @Column(name="BAT_EXEC_STS_CD")
    val batchExecStatusCode: String,

    @Column(name="BAT_EXEC_FROM_TMST")
    val batchExecFromTimestamp: Date,

    @Column(name="BAT_EXEC_TO_TMST")
    val batchExecToTimestamp: Date,

    @Column(name="BAT_EXEC_TOT_CNT")
    val batchExecTotalCount: Int,

    @Column(name="BAT_EXEC_SCS_CNT")
    val batchExecSuccessCount: Int,

    @Column(name="BAT_EXEC_ERR_CNT")
    val batchExecErrorCount: Int,

    @Column(name="BAT_EXEC_INPT_FILE_NM")
    val batchExecInputFileName: String,

    @Column(name="BAT_EXEC_OTPT_FILE_NM")
    val batchExecOutputFileName: String,

    @Column(name="FRST_REG_TMST")
    val firstRegisteredTimestamp: Date,

    @Column(name="FRST_REG_EMPNO")
    val firstRegisteredEmployeeNumber: String,

    @Column(name="FRST_REG_BRCD")
    val firstRegisteredBranchCode: String,

    @Column(name="LAST_CHNG_TMST")
    val lastChangedTimestamp: Date,

    @Column(name="LAST_CHNG_EMPNO")
    val lastChangedEmployeeNumber: String,

    @Column(name="LAST_CHNG_BRCD")
    val lastChangedBranchCode: String,
) {
}