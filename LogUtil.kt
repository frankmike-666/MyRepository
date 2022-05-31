package com.android.myhikinput.util

import android.util.Log

/**
 * @Description TODO
 *
 * @Author GXD
 * @Date 2022/5/31
 */
object LogUtil {
    private const val TAG = "tag"
    private const val STACK_INDEX = 5

    private fun getFileName() = Thread.currentThread().stackTrace[STACK_INDEX].fileName

    private fun getMethodName() = Thread.currentThread().stackTrace[STACK_INDEX].methodName

    private fun getLineNumber() =
        Thread.currentThread().stackTrace[STACK_INDEX].lineNumber.toString() + ""

    private fun getHyperlinkLog()
        = ".(" + getFileName() + ":" + getLineNumber() + ")" + getMethodName()

    fun v(msg: String) = Log.v(TAG, msg + "--->" + getHyperlinkLog())

    fun d(msg: String) = Log.d(TAG, msg + "--->" + getHyperlinkLog())

    fun i(msg: String) = Log.i(TAG, msg + "--->" + getHyperlinkLog())

    fun w(msg: String) = Log.w(TAG, msg + "--->" + getHyperlinkLog())

    fun e(msg: String) = Log.e(TAG, msg + "--->" + getHyperlinkLog())
}