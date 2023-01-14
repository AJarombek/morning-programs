// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpJan13",
    products: [
        .library(
            name: "mpJan13",
            targets: ["mpJan13"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpJan13",
            dependencies: []),
        .testTarget(
            name: "mpJan13Tests",
            dependencies: ["mpJan13"]),
    ]
)
