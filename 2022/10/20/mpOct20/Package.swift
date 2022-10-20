// swift-tools-version: 5.6

import PackageDescription

let package = Package(
    name: "mpOct20",
    products: [
        .library(
            name: "mpOct20",
            targets: ["mpOct20"]),
    ],
    dependencies: [],
    targets: [
        .target(
            name: "mpOct20",
            dependencies: []),
        .testTarget(
            name: "mpOct20Tests",
            dependencies: ["mpOct20"]),
    ]
)
