/**
 * Asynchronously pauses execution for a specified number of milliseconds
 * @param millis - The number of milliseconds to sleep
 * @returns A Promise that resolves after the specified delay
 */
async function sleep(millis: number): Promise<void> {
    // Create a Promise that resolves after the specified timeout
    return new Promise(resolve => setTimeout(resolve, millis));
}

/**
 * Example usage:
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */
