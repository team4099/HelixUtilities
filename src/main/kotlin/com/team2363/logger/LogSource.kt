package com.team2363.logger

data class LogSource(val name: String, val supplier: () -> String)