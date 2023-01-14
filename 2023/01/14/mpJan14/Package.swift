// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpJan14",
    products: [
        .library(
            name: "mpJan14",
            targets: ["mpJan14"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpJan14",
            dependencies: []),
        .testTarget(
            name: "mpJan14Tests",
            dependencies: ["mpJan14"]),
    ]
)
