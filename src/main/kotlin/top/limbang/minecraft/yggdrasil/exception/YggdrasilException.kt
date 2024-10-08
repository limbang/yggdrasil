/*
 * Copyright 2024 limbang and contributors.
 *
 * 此源代码的使用受 GNU AGPLv3 许可证的约束，该许可证可在"LICENSE"文件中找到。
 * Use of this source code is governed by the GNU AGPLv3 license that can be found in the "LICENSE" file.
 */

package top.limbang.minecraft.yggdrasil.exception

import top.limbang.minecraft.yggdrasil.model.ErrorMessage
import java.io.IOException

/**
 * ### Yggdrasil 响应异常
 */
class YggdrasilException(val errorMessage: ErrorMessage) : IOException(errorMessage.errorMessage)