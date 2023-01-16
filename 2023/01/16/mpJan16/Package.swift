// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpJan16",
    products: [
        .library(
            name: "mpJan16",
            targets: ["mpJan16"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpJan16",
            dependencies: []),
        .testTarget(
            name: "mpJan16Tests",
            dependencies: ["mpJan16"]),
    ]
)
